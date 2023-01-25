package JavasFunktionsGränsnitt;

public class JavasFunktionsGränssnitt {

    public JavasFunktionsGränssnitt(){

        Runnable runnable = new Runnable() { // anonym klass
            @Override
            public void run() {
                System.out.println("Remember who you are");
            }
        };

        Runnable runnable2 = () -> System.out.println("Please forgive me");

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread.start();
        thread2.start();
    }

    public static void main(String[] args) {
        JavasFunktionsGränssnitt javasFunktionsGränssnitt = new JavasFunktionsGränssnitt();
    }
}
