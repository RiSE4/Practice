public enum EnumTapioca implements IMetadata {

    CAFE_LATTE(0, "cafe_latte"),
    MILK_TEA(1, "milk_tea"),
    MATCHA(2, "matcha"),
    MATCHA_TEA(3, "matcha_tea"),
    STRAWBERRY_MILK(4, "strawberry_milk");

    private final int meta;
    private final String name;

    EnumTapioca(int meta, String name)
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
}