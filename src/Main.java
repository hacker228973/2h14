public class Main {
    public static void main(String[] args) {
        MyArrayList<String> Arr = new MyArrayList<>();
        Arr.add(0, "lololo");
        Arr.add(9, "gligli");
        Arr.add(9, "gliglo");
        Arr.remove(1);

        System.out.println(Arr);
    }

}
