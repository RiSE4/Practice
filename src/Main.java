import com.sun.prism.shader.Solid_ImagePattern_Loader;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.omg.CORBA.SetOverrideTypeHelper;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        /*
        従来の方法
        回数とStringの中身を手動で決める
        よく間違える上、手順が増えて非効率的
         */
        for(int i = 0; i < 3; ++i)
        {
            String[] list = new String[] { "climbing", "ivy_up", "ivy_down" };
            System.out.println(list[i]);
        }

        System.out.println("############### TAPIOCA ###############");

        forEnumString(EnumTapioca.class, EnumTapioca.values().length);

        System.out.println("################# VASE ################");

        forEnumString(EnumVase.class, EnumVase.values().length);
    }


    //取得用メソッド
    private static <E extends IMetadata> E valueOf(Class<E> target, int meta)
    {
        return Arrays.stream(target.getEnumConstants())
                .filter(i -> i.getMetadata() == meta)
                .findFirst()
                .orElse(null);
    }

    //繰り返しヘルパー
    private static <E extends IMetadata> void forEnumString(Class<E> target, int maxMeta)
    {
        for(int i = 0; i < maxMeta; ++i)
        {
            String name = valueOf(target, i).getName();
            System.out.println(name);
        }
    }
}
