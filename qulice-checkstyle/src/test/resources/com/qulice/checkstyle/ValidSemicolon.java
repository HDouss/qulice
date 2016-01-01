/**
 * Hello.
 */
package foo;

/**
 * Simple.
 * @version $Id$
 * @author John Smith (john@example.com)
 * @since 1.0
 */
public final class ValidSemicolon {
    /**
     * Method without extra semicolon in the end
     * of try-with-resources head.
     */
    public void view() {
        try (
            final Closeable door = new Door();
            final Closeable window = new Window();
            final Closeable win = new Window()
        ) {
            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        }
    }
}
