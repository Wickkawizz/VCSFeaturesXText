package library.commands

class LogCommandGenerator {
	def generate()
	'''
package commands;

import controllers.PorcelainController;

/**
 * @hidden This class is not used for now.
 * @see PorcelainController.logCommand() for the actual use of this method.
 */
public class LogCommand implements ICommand {

	@Override
	public void call() {
		PorcelainController.getInstance().logCommand();
	}

}

	'''
}