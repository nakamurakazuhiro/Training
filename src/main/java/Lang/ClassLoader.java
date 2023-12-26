package Lang; // パッケージ名は小文字にする

public class ClassLoader {

    public static void main(String[] args) {
        try {
            // 現在のクラスのクラスローダーを使用してクラスをロードする
            Class<?> myClass = ClassLoader.class.getClassLoader().loadClass("com.example.MyClass");
            System.out.println("Class loaded: " + myClass.getName());
        } catch (ClassNotFoundException e) {
            // エラーハンドリングのためにスタックトレースをログや表示に使用する
            System.out.println("Class not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
