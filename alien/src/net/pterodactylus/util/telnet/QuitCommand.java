/*
 * utils - QuitCommand.java - Copyright © 2008-2009 David Roden
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.pterodactylus.util.telnet;

import java.util.List;

/**
 * Special command that closes the connection to the telnet control.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public class QuitCommand extends AbstractCommand {

	/**
	 * Creates a new quit command.
	 */
	public QuitCommand() {
		super("QUIT", "Closes the connection.");
	}

	/**
	 * @see net.pterodactylus.util.telnet.Command#execute(java.util.List)
	 */
	@Override
	public Reply execute(List<String> parameters) {
		return new Reply(200, "Goodbye.");
	}

}
