package WordProject.view;

import java.util.ArrayList;

import WordProject.controller.Library;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> options;
    Library l = new Library();

    public Menu(){
        options = new ArrayList<>();
    }

    public Menu(String t, String[] arr){
        title = t;
        options = new ArrayList<>();
        for (String s : arr) {
            options.add((T) s);
        }
    }

    public void display(){
        System.out.println(title);
        for (int i = 0; i < options.size(); i++) {
            System.out.println(i+1 + "." +options.get(i));
        }
    }

    public int getSelected() {
        display();
        return l.getInt("Enter your choice", 1, options.size() + 1);
    }
    public abstract void execute(int n);
    //-------------------------------------------
    
        public void run() {
            while (true) {
                int n = getSelected();
                System.out.println("cc");
                execute(n);
                if (n > options.size()) {
                    break;
                }
            }
        }
}
