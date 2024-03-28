package com.adepuu.exercises.session8;

public class toDolist {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static String[] model = new String[10];
    public static void main(String[] args) {

        viewToDolist();
    }

    public static void tampilkanTodoList() {
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

        tampilkanTodoList();
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

        tampilkanTodoList();
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
            tampilkanTodoList();
            System.out.println();
            System.out.println("TODOLIST");
            System.out.println("OPSI: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih: ");

            if(input.equals("1")) {
                viewTambahTodoList();
            } else if (input.equals("2")) {
                viewHapusTodoList();
            } else if(input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        viewToDolist();
    }

    public static void viewTambahTodoList() {
        System.out.println("MANAMBAH TODOLIST");

        var todo = input("Todo (x jika Batal)");

        if(todo.equals("x")){
            // batal
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewTambahTodoList() {
        addTodoList("aku");
        addTodoList("kamu");

        viewTambahTodoList();

        tampilkanTodoList();


    }

    public static void viewHapusTodoList() {
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor todo yang dihapus (x jika Batal) ");

        if(number.equals("x")) {
            // batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success) {
                System.out.println("gagal mengapus todolist: " + number);
            }
        }

    }
}
