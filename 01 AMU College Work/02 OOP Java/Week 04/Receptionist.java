import java.util.ArrayList;

/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

     This class is a child class to the super.  Things I changed:
     1.  Added a feature that counts tasks, changes focus based on task number
     2.  Placed everything in greeting to keep simple

 *******************/

public class Receptionist extends HospitalEmployee {

    // Attributes
    private int taskNum;
    private ArrayList<String> taskList;

    // Constructor
    public Receptionist(String name, double annualPay) {
        super(name, annualPay);
        this.taskNum = 0;
        this.taskList = new ArrayList<>(100);
    }

    // OR Meth
    @Override
    public void greeting() {
        System.out.println("Good day, my name is " +
                this.name +", how may I help you?");
        getNumberOfTasks();                                     //   We call one meth that uses multiple meths
    }

    // Meths
    public void addTasks(String task ){                         //   We can add tasks to overwork the receptionist.
        taskList.add(task);                                     // This can invite errors if we put too much
    }

    public void getNumberOfTasks() {
        int n = 0;
        for (int i = 0; i < this.taskList.size(); i++) {
            n++;

        }
        this.taskNum = n;
        System.out.println("\t" + this.name +
                " is currently working on " +
                this.taskNum + " tasks.");

        modFocus(this.taskNum);

        System.out.println("\tThus, their current focus is at " +
                this.focus);
    }

    public void modFocus(int num) {
        if (num < 10 ) {
            this.focus = 100;
        } else if (num < 30) {
            this.focus = 80;
        } else if (num < 60) {
            this.focus = 50;
        } else if (num < 75) {
            this.focus = 20;
        } else {
            this.focus = 0;
        }
    }


}


















