package org.apache.cayenne.modeler.undo;

import static org.junit.Assert.*;

import javax.swing.JTextField;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

import org.apache.cayenne.modeler.util.TextAdapter;
import org.apache.cayenne.validation.ValidationException;
import org.junit.Test;

public class CayenneUndoManagerTest {

	CayenneUndoManager target;
	
	@Test
	public void testUndoWithNull() {
		target= new CayenneUndoManager(null);
		assertNotNull(target);
		target.undo();
		
	}
	
	@Test
	public void testUndo() {
		target= new CayenneUndoManager(null);
		assertNotNull(target);
		UndoManager um = new UndoManager();
		//RemoveAttributeUndoableEdit raue = new RemoveAttributeUndoableEdit();
		//CayenneUndoableEdit aue = new CayenneUndoableEdit();
		//UndoableEdit ref = DefaultStyledDocument.AttributeUndoableEdit(null,null,null);\\
		
//		JTextField jtf = new JTextField();
//		TextCompoundEdit tce = new TextCompoundEdit(new TextAdapter(jtf){
//
//			@Override
//			protected void updateModel(String text) throws ValidationException {
//				// TODO Auto-generated method stub
//				
//			}}, new JTextFieldUndoListener(jtf));
//		
		target.addEdit(new TextCompoundEditTestUtility());//UndoableEdit);
		target.undo();
	}
	
	
	class TextCompoundEditTestUtility implements  UndoableEdit{
		
		UndoableEdit undoableEdit;
		
		@Override
		public boolean addEdit(UndoableEdit undoableEdit) {
			this.undoableEdit = undoableEdit;
			return true;
		}

		@Override
		public boolean canRedo() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean canUndo() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void die() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getPresentationName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getRedoPresentationName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUndoPresentationName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isSignificant() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void redo() throws CannotRedoException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean replaceEdit(UndoableEdit arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void undo() throws CannotUndoException {
			// TODO Auto-generated method stub
			
		}
		
	
	}

}
