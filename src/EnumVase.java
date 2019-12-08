public enum EnumVase {

    CLIMBING(0, "climbing"),
    IVY_UP(1, "ivy_up"),
    IVY_DOWN(2, "ivy_down");

    private static final EnumVase[] META_LOOKUP = new EnumVase[values().length];
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

    public static EnumVase byMetadata(int meta)
    {
        if(meta < 0 || meta >= META_LOOKUP.length)
        {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    static
    {
        EnumVase[] var = values();

        for(EnumVase type : var)
        {
            META_LOOKUP[type.getMetadata()] = type;
        }
    }

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