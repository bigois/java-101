package br.com.bigois.interfaces.functional;

/*
 * This annotation is optional, but it is a good practice to use it because it triggers
 * a compilation error if another abstract method is added
 */
@FunctionalInterface
/*
 * <T> is a generic type parameter, which means that the Validator interface can
 * be used with any object type.
 * It is common to use <E> for element, <K> for key, <V> for value, <N> for
 * number, and <S> for string.
 * These are just conventions, you can use any letter you want (e.g. <Pineapple>
 * is also valid)
 */
public interface Validator<T> {
    /*
     * The parameter name can be any valid identifier (e.g. T pineapple is also
     * valid)
     */
    boolean isValid(T value);

    static <T> void showValidatorResult(T value, Validator<T> validator) {
        System.out.println(value + " is valid: " + validator.isValid(value));
    }
}
