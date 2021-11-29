/*
 * Client triển khai các phương thức: login, logout, sendMsg, lấy toàn nội dung chat, lấy toàn bộ người tham gia
 */
package chatServer;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vijani
 */
public class ChatImpl extends UnicastRemoteObject implements ChatInterface, Serializable{

	
	private static final long serialVersionUID = -5873768449418843663L;
	List<String> users = new ArrayList<String>();
    List<Message> messages = new ArrayList<Message>();

    public ChatImpl() throws RemoteException {
        super();    // This activates code in UnicastRemoteObject that
                    // performs the RMI linking and remote object initialization.
    }

    public boolean login(String username) throws RemoteException {
        boolean flag = false;
        for (String user : users) {
            if (username.equals(user)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            users.add(username);
            Message message = new Message();
            message.setUsername(username);
            message.setMsg(" joined the conversation ");
            message.setType("join");
            message.setDate(new Date());
            messages.add(message);
            
            return true;
        }else
            return false; 
        //can also use .contains method in a List without using a flag
    }

    public void logout(String username) throws RemoteException {
        users.remove(username);
        Message message = new Message();
        message.setUsername(username);
        message.setMsg(" left the conversation ");
        message.setType("left");
        message.setDate(new Date());
        messages.add(message);
    }

    public void addMessage(Message message) throws RemoteException {
        messages.add(message);
    }

    public List<Message> getAllMessages() throws RemoteException {
        for(Message m : messages){
            System.out.println(m.getUsername() + " " + m.getMsg());
        }
        return messages;
    }
    
    public List<String> getAllUsers() throws RemoteException{
        for(String u : users){
            System.out.println(u);
        }
        return users;
    }

}