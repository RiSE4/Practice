public enum EnumVase implements IMetadata {

    CLIMBING(0, "climbing"),
    IVY_UP(1, "ivy_up"),
    IVY_DOWN(2, "ivy_down");

    private final int meta;
    private final String name;

    EnumVase(int meta, String name)
    {
        this.meta = meta;
        this.name = name;
    }

    public int getMetadata()
    {
        return this.meta;
    }

    public String toString()
    {
        return this.name;
    }

    public String getName()
    {
        return this.name;
    }

    /** 旧式メソッド */
    public static EnumVase valueOf(int meta)
    {
        EnumVase[] array = values();
        for(EnumVase num : array)
        {
            if(meta == num.getMetadata())
            {
                return num;
            }
        }

        return null;
    }
}