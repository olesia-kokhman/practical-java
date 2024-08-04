enum Color {
    WHITE, 
    RED, 
    BLUE
}

enum Type {
    RARE,
    ORDINARY
}

class ColorException extends Exception {
    
    public ColorException(String message) {
        super(message);
    };
    
}

class TypeException extends Exception {
    
    public TypeException(String message) {
        super(message);
    };
    
}

class Plant {
    private String name;
    private Color color;
    private Type type;
    
    public Plant(String type, String color, String name) throws ColorException, TypeException {
        
        try {
            this.type = Type.valueOf(type.toUpperCase());
            //Enum.valueOf(Type, type);
        } catch (IllegalArgumentException exception) {
            throw new TypeException("Invalid value " + type + " for field type");
        }
        
        try {
            this.color = Color.valueOf(color.toUpperCase());
            //Enum.valueOf(Color, color);
        } catch (IllegalArgumentException exception) {
            throw new ColorException("Invalid value " + color + " for field color");
        }
        
        this.name = name;
    };
    
    public String getName() {
        return this.name;
    };
    
    public Color getColor() {
        return this.color;
    };
    
    public Type getType() {
        return this.type;
    };
    
    @Override
    public String toString() {
        return "{type: " + this.getType().toString() + ", color: " + this.getColor().toString() + ", name: " + 
        this.getName() + "}";
    };
}