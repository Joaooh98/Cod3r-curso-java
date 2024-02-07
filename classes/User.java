package classes;

public class User {

    String name;
    String email;

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof User) {
            
            User userO = (User) obj;
            
            boolean nameEqual = userO.name.equals(this.name);
            boolean emailEqual = userO.email.equals(this.email);
            
            return nameEqual && emailEqual;
        }
        return false;
    }
    
    
}
