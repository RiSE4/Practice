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

    }

    /*
    public static void forItemModels(Block block, int maxMeta, String category, String[] typeName)
    {
        for(int i = 0; i < maxMeta + 1; ++i)
        {
            CocricotLite.proxy.registerItemModel(Item.getItemFromBlock(block), i, new ModelResourceLocation("cocricotlite:" + category + "/" + block.getUnlocalizedName().substring(5) + "_" + typeName[i], "inventory"));
        }
    }

    //繰り返しヘルパー
    private static <E extends Enum & IMetadata> void forItemModels(Class<E> targetEnum targetEnum)
    {
        for(int i = 0; i < targetEnum.values().length; ++i)
        {

        }
    }
    */

    //取得用メソッド
    private static <E extends Enum & IMetadata> E valueOf(Class<E> target, int meta) {

        return Arrays.stream(target.getEnumConstants())
                .filter(data -> data.getMetadata() == meta)
                .findFirst()
                .orElse(null);
    }
}
