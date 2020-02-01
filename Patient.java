import java.util.ArrayList;

public class Patient{

    private ArrayList<String> firstName = new ArrayList<>();
    private ArrayList<String> lastName = new ArrayList<>();
    private ArrayList<String> bloodType = new ArrayList<>();
    private ArrayList<String> gender = new ArrayList<>();

    public Patient(){

    }


    // Getters

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getBloodType(){
        return this.bloodType;
    }

    public String getGender(){
        return this.gender;
    }

    // Setters

    public void setFirstName(ArrayList<String> firstName){
        this.firstName = firstName;
    }

    public void setlastName(ArrayList<String> lastName){
        this.lastName = lastName;
    }

    public void setBloodType(ArrayList<String> bloodType){
        this.bloodType = bloodType;
    }

    public void setGender(ArrayList<String> gender){
        this.gender = gender;
    }


    // Return

    public String toString(){

        StringBuilder finalReport = new StringBuilder();

        finalReport.append("List of all Patients:\n\n");

        String currentFirstName;
        String currentLastName;
        String currentFullName;
        String currentGender;
        String currentBloodType;
        int currentPatientNumber = 0;

        for(int i = 0; i < firstName.size(); i++){

            currentFirstName = firstName.get(i).toString();
            currentLastName = lastName.get(i).toString();
            currentGender = gender.get(i).toString();
            currentBloodType = bloodType.get(i).toString();

            currentPatientNumber += 1;

            finalReport.append("Patient #");
            finalReport.append(currentPatientNumber);
            finalReport.append("\n");
            finalReport.append("Fullname: ");
            finalReport.append(currentFirstName);
            finalReport.append(" ");
            finalReport.append(currentLastName);
            finalReport.append("\n");
            finalReport.append("Gender: ");
            finalReport.append(currentGender);
            finalReport.append("\n");
            finalReport.append("Blood Type: ");
            finalReport.append(currentBloodType);
            finalReport.append("\n");
            finalReport.append("---------\n");
        }

        return finalReport.toString();
    }
    
}