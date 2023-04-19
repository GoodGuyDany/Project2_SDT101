import java.util.Date;
import java.util.ArrayList;
public class Part2_2_Inheritance_Example {
    public static void main(String[] args) {
        Chat chat = new Chat("Example Chat");

        User user1 = new User("John", "123-456-7890", "Admin");
        User user2 = new User("Jane", "555-555-5555", "Member");

        chat.addUser(user1);
        chat.addUser(user2);

        TextMessage textMessage = new TextMessage(new Date(), "John", "Hello World!");
        chat.addMessage(textMessage);

        ImageMessage imageMessage = new ImageMessage(new Date(), "Jane", "Look at this funny picture!", "https://tinyjpg.com/images/social/website.jpg");
        chat.addMessage(imageMessage);

        VoiceMessage voiceMessage = new VoiceMessage(new Date(), "Jane",  "audio.mp3");
        chat.addMessage(voiceMessage);

        LocationMessage locationMessage = new LocationMessage(new Date(),"Jane", "Kyiv");
        chat.addMessage(locationMessage);

        FileMessage fileMessage = new FileMessage(new Date(), "John", "Sending you the pdf:", "File.pdf");
        chat.addMessage(fileMessage);

        ContactMessage contactMessage = new ContactMessage(new Date(), "Jane", "+111111");
        chat.addMessage(contactMessage);

        System.out.println(chat.output());
    }
}
// BaseMessage (Abstract)
abstract class BaseMessage {
    protected Date date;
    protected String author;

    public BaseMessage(Date date, String author) {
        this.date = date;
        this.author = author;
    }

    public abstract String output();
}

// TextMessage
class TextMessage extends BaseMessage {
    protected String text;

    public TextMessage(Date date, String author, String text) {
        super(date, author);
        this.text = text;
    }

    public String output() {
        return "[" + date.toString() + "] " + author + ": " + text;
    }
}

// ImageMessage (extends TextMessage and have text property)
class ImageMessage extends TextMessage {
    protected String image;

    public ImageMessage(Date date, String author, String text, String image) {
        super(date, author, text);
        this.image = image;
    }

    public String output() {
        return "[" + date.toString() + "] " + author + ": " + text + " [Image: " + image + "]";
    }
}

// VoiceMessage
class VoiceMessage extends BaseMessage {
    protected String voice;

    public VoiceMessage(Date date, String author, String voice) {
        super(date, author);
        this.voice = voice;
    }

    public String output() {
        return "[" + date.toString() + "] " + author + ": " + voice;
    }
}

// FileMessage (extends TextMessage and have text property)
class FileMessage extends TextMessage {
    protected String file;

    public FileMessage(Date date, String author, String text, String file) {
        super(date, author, text);
        this.file = file;
    }

    public String output() {
        return "[" + date.toString() + "] " + author + ": " + text + " [File: " + file + "]";
    }
}

// LocationMessage
class LocationMessage extends BaseMessage {
    protected String location;

    public LocationMessage(Date date, String author, String location) {
        super(date, author);
        this.location = location;
    }

    public String output() {
        return "[" + date.toString() + "] " + author + ": " + location;
    }
}

// ContactMessage
class ContactMessage extends BaseMessage {
    protected String contact;

    public ContactMessage(Date date, String author, String contact) {
        super(date, author);
        this.contact = contact;
    }

    public String output() {
        return "[" + date.toString() + "] " + author + ": " + contact;
    }
}

record User(String nickname, String phoneNumber, String title) {
}

class Chat {
    private final String chatName;
    private final ArrayList<User> users;
    private final ArrayList<BaseMessage> messages;

    public Chat(String chatName) {
        this.chatName = chatName;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addMessage(BaseMessage message) {
        messages.add(message);
    }

    public String output() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Chat name: %s\n", chatName));
        sb.append("Users:\n");
        for (User user : users) {
            sb.append(String.format("%s (%s)\n", user.nickname(), user.title()));
        }
        sb.append("Messages:\n");
        for (BaseMessage message : messages) {
            sb.append(message.output()).append("\n");
        }
        return sb.toString();
    }
}
