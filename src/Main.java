import java.util.Objects;

public class Main {

    public static void main(String[] args)
    {
        //新しくEnumVaseに作ったメソッドを使った方法
        for(int i = 0; i < EnumVase.values().length; ++i)
        {
            EnumVase vase = EnumVase.valueOf(i);
            String name = Objects.requireNonNull(vase).getName();

            System.out.println(name);
        }

        System.out.println("########################################");

        /*
        従来の方法
        この場合毎回数値を入れないといけないのでコピペするときに、すぐ忘れてエラー吐くのでなんとかしたい
         */
        for(int i = 0; i < 3; ++i)
        {
            String[] list = new String[] { "climbing", "ivy_up", "ivy_down" };
            System.out.println(list[i]);
        }
    }

//    private static<E extends Enum> E valueOf(Class<E> targetEnum, int meta)
//    {
//        EnumVase[] array = values();
//        for(EnumVase num : array)
//        {
//            if(meta == num.getMetadata())
//            {
//                return num;
//            }
//        }
//
//        return null;
//    }
}
