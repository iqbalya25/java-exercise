package com.adepuu.exercises.session8;

public class toDolist {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static String[] model = new String[10];
    public static void main(String[] args) {

        viewToDolist();
    }

    public static void showTodoList() {
        for(var i = 0; i < model.length; i++) {
            String todoString = model[i];
            var no = i + 1;

            if(todoString != null) {
                System.out.println(no + ". " + todoString);
            }
        }
    }
    public static void addTodoList(String todoString) {
        var isFull = true;
        for(var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                isFull = false;
                break;
            }
        }

        if(isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for(var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for(var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                model[i] = todoString;
                break;
            }
        }
    }

    public static void testTambahTodoList() {
        for(int i = 1; i <= 25; i++) {
            addTodoList("Contoh todo ke-" + i);
        }

        showTodoList();
    }


    public static boolean removeTodoList(Integer nomor) {
        if((nomor -1) >= model.length) {
            return false;
        } else if(model[nomor - 1] == null) {
            return false;
        } else {
            for(int i = (nomor-1); i < model.length; i++) {
                if(i == (model.length -1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }

            return true;
        }
    }

    public static void testHapusTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        for(int i = 3; i < 7; i++) {
            addTodoList("tambah jadi ke-" + i);
        }

        var result = removeTodoList(10);
        System.out.println(result);

        result = removeTodoList(8);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }


    public static void testInput() {
        var nama = input("Nama");
        System.out.print("Halo " + nama);
    }

    public static void viewToDolist() {
        while(true) {
            showTodoList();
            System.out.println();
            System.out.println("TODOLIST");
            System.out.println("OPSI: ");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("x. Out");

            var input = input("Choose: ");

            if(input.equals("1")) {
                viewAddingTodoList();
            } else if (input.equals("2")) {
                viewHapusTodoList();
            } else if(input.equals("x")) {
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }



    public static void viewAddingTodoList() {
        System.out.println("ADDING TODOLIST");

        var todo = input("Todo (x for cancel)");

        if(todo.equals("x")){

        } else {
            addTodoList(todo);
        }
    }

    public static void testViewTambahTodoList() {
        addTodoList("aku");
        addTodoList("kamu");

        viewAddingTodoList();

        showTodoList();


    }

    public static void viewHapusTodoList() {
        System.out.println("REMOVE TODOLIST");

        var number = input("Number TODO want to remove (x for cancel) ");

        if(number.equals("x")) {

        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success) {
                System.out.println("failed remove todolist: " + number);
            }
        }

    }
}
