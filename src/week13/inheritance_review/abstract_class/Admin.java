package week13.inheritance_review.abstract_class;

import week13.inheritance_review.abstract_class.DiscordUser;

public class Admin extends DiscordUser {

    public Admin(String role, String name, String id) {
        super(role, name, id);
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending announcement to @everyone");
    }

    @Override
    public void joinDiscord(String server) {
        System.out.println(getName() + " is joining " + server + " as an Admin");
    }

    public void createChannel(String channel) {
        System.out.println("Admin is creating a channel - " + channel);
    }
}