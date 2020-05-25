package lv.madara.Bookstore;

public class Author {

    //klasei Author ir 3 atribūti:

    private String name;
    private String email;
    private char gender;

    //veido konstruktoru
    //tam jābūt public
    //ar automātisko metodi (generate-->constructor):
    //pārbauda vai viss ir ok

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') { //konstruktorā var likt pārbaudi ar if palīdzību
            this.gender = gender;
        }else{ //lai konsole printētu paziņojumu, kad ievadīts kas cits, nevis m vai f
            this.gender = '-'; //ieliek -, ja ieraksta nepariezi
            System.out.println("Please input 'm' or 'f' for gender!");
        }
    }

    //veido visiem mainīgajiem Getters (automātiski):

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    //veido Setter tikai e-mailam:

    public void setEmail(String email) {
        this.email = email;
    }

    //toString (automātiski)
    //izdzēš tekstu un ieraksta kā pašam vajag
    @Override
    public String toString() {
        return this.name + " (" + this.gender + ") " + "at " + this.email; //kādu rezultātu vēlas atgriezt
    }
}
