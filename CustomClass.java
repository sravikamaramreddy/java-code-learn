
import java.util.List;
import java.util.Map;

public class CustomClass {
    // Primitive data types
    private int integerValue;
    private double doubleValue;
    private boolean booleanValue;
    private char charValue;

    // Wrapper classes
    private Integer integerObject;
    private Double doubleObject;
    private Boolean booleanObject;
    private Character charObject;

    // String
    private String stringValue;

    // Arrays
    private int[] integerArray;
    private String[] stringArray;

    // Collections
    private List<String> stringList;
    private Map<String, Integer> stringIntegerMap;

    // Custom object
    private AnotherClass customObject;

    // Constructor
    public CustomClass(int integerValue, double doubleValue, boolean booleanValue, char charValue,
                       Integer integerObject, Double doubleObject, Boolean booleanObject, Character charObject,
                       String stringValue, int[] integerArray, String[] stringArray,
                       List<String> stringList, Map<String, Integer> stringIntegerMap, AnotherClass customObject) {
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
        this.booleanValue = booleanValue;
        this.charValue = charValue;
        this.integerObject = integerObject;
        this.doubleObject = doubleObject;
        this.booleanObject = booleanObject;
        this.charObject = charObject;
        this.stringValue = stringValue;
        this.integerArray = integerArray;
        this.stringArray = stringArray;
        this.stringList = stringList;
        this.stringIntegerMap = stringIntegerMap;
        this.customObject = customObject;
    }

    public CustomClass() {
    }

    // Getters and Setters
    public int getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(int integerValue) {
        this.integerValue = integerValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public Integer getIntegerObject() {
        return integerObject;
    }

    public void setIntegerObject(Integer integerObject) {
        this.integerObject = integerObject;
    }

    public Double getDoubleObject() {
        return doubleObject;
    }

    public void setDoubleObject(Double doubleObject) {
        this.doubleObject = doubleObject;
    }

    public Boolean getBooleanObject() {
        return booleanObject;
    }

    public void setBooleanObject(Boolean booleanObject) {
        this.booleanObject = booleanObject;
    }

    public Character getCharObject() {
        return charObject;
    }

    public void setCharObject(Character charObject) {
        this.charObject = charObject;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int[] getIntegerArray() {
        return integerArray;
    }

    public void setIntegerArray(int[] integerArray) {
        this.integerArray = integerArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public void setStringIntegerMap(Map<String, Integer> stringIntegerMap) {
        this.stringIntegerMap = stringIntegerMap;
    }

    public AnotherClass getCustomObject() {
        return customObject;
    }

    public void setCustomObject(AnotherClass customObject) {
        this.customObject = customObject;
    }
}

// Example of another custom class
class AnotherClass {
    private String name;

    public AnotherClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
