public static Plant tryCreatePlant(String type, String color, String name) throws ColorException, TypeException {
    
    Plant plant;
    String defaultColor = color;
    String defaultType = type;
    
    try {
        plant = new Plant(defaultType, defaultColor, name);
    } catch (ColorException exception) {
        defaultColor = "RED";
        try {
            plant = new Plant(defaultType, defaultColor, name);
        } catch (TypeException typeException) {
            defaultType = "ORDINARY";
        }
    } catch (TypeException exception) {
        defaultType = "ORDINARY";
        try {
            plant = new Plant(defaultType, defaultColor, name);
        } catch (ColorException typeException) {
            defaultColor = "RED";
        }
    } finally {
        plant = new Plant(defaultType, defaultColor, name);
    }
    
    return plant;
    
};