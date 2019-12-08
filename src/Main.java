import jdk.nashorn.internal.ir.Block;

import java.util.Arrays;
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

        System.out.println("#######################################");


        for(int i = 0; i < EnumVase.values().length; ++i)
        {
            EnumVase vase = valueOf(EnumVase.class, i);
            String name = vase.getName();
            System.out.println(name);
        }

        System.out.println("#######################################");

        /*
        従来の方法
        この場合毎回数値を入れないといけないのでコピペするときに、すぐ忘れてエラー吐くのでなんとかしたい
         */
        for(int i = 0; i < 3; ++i)
        {
            String[] list = new String[] { "climbing", "ivy_up", "ivy_down" };
            System.out.println(list[i]);
        }

        System.out.println("############### TAPIOCA ###############");

        forEnumString(EnumTapioca.class, EnumTapioca.values().length);

    }


    //取得用メソッド
    private static <E extends Enum & IMetadata> E valueOf(Class<E> target, int meta) {

        return Arrays.stream(target.getEnumConstants())
                .filter(data -> data.getMetadata() == meta)
                .findFirst()
                .orElse(null);
    }

    //繰り返しヘルパー
    private static <E extends Enum & IMetadata> void forEnumString(Class<E> target, int maxMeta)
    {
        for(int i = 0; i < maxMeta; ++i)
        {
            String name = valueOf(target, i).getName();
            System.out.println(name);
        }
    }
}
