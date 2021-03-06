/**
 * 
 */
package ru.flip.xOgraph.actions;

import ru.flip.xOgraph.Project;

/**
 * @author Vizu
 *
 */
public class HexDistanceChangeAction extends AbstractAction {
	
	private double oldHexDistance;
	private double newHexDistance;
	
	public HexDistanceChangeAction(double newHexDistance) {
		this.newHexDistance = newHexDistance;
		oldHexDistance = Project.getMap().singleHexDistance;
	}
	/* (non-Javadoc)
	 * @see ru.flip.xOgraph.actions.AbstractAction#commit()
	 */
	@Override
	public void commit() {
		Project.getMap().singleHexDistance = newHexDistance;
	}

	/* (non-Javadoc)
	 * @see ru.flip.xOgraph.actions.AbstractAction#undo()
	 */
	@Override
	public void undo() {
		Project.getMap().singleHexDistance = oldHexDistance;

	}

}
