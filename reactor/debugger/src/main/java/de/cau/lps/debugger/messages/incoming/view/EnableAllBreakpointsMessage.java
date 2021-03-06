package de.cau.lps.debugger.messages.incoming.view;

import de.cau.lps.debugger.messages.AbstractMessage;
import de.cau.lps.debugger.messages.incoming.IncomingMessageType;

/**
 * Message used to signal the enabling of all breakpoints.
 * 
 * @author Thomas Ulrich
 *
 */
public class EnableAllBreakpointsMessage extends AbstractMessage {

    /**
     * Initializes a new instance of the {@link EnableAllBreakpointsMessage} class.
     * 
     * @param message
     *            A String encapsulating the 'enable all breakpoints' message.
     */
    public EnableAllBreakpointsMessage(String message) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.lps.debugger.messages.AbstractMessage#getStringRepresentation()
     */
    @Override
    protected String getStringRepresentation() {
        return IncomingMessageType.ENABLEALLBREAKPOINTS.toString();
    }
}
