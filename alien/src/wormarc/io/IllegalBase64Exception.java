// Pillaged from the Freenet codebase, licensed under GNU General Public License V2
// package freenet.support;

package wormarc.io;

/**
 * This exception is thrown if a Base64-encoded string is of an illegal length
 * or contains an illegal character.
 */
public class IllegalBase64Exception
    extends Exception
{
    private static final long serialVersionUID = -1;
    public IllegalBase64Exception(String descr)
    {
        super(descr);
    }
}
