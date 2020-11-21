
public class Core{

    interface Lambda<T>{

        public T function();
    }

    public static void main(final String[] args) {

        final Lambda<String> stringFunc = () -> {

            return "Hello world from lambda";
        };

        System.out.println(stringFunc.function());
    }
}