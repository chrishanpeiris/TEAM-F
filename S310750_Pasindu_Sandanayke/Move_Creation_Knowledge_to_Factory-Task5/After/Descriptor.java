package descriptors;

public abstract class AttributeDescriptor {
public static AttributeDescriptor forInteger(...) {
return new DefaultDescriptor(...);
}
public static AttributeDescriptor forDate(...) {
return new DefaultDescriptor(...);
}
public static AttributeDescriptor forString(...) {
return new DefaultDescriptor(...);
}
