/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.unikernel.bummel.visual_editor;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import java.util.List;
import net.unikernel.bummel.jgraph.ElementModel;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;

/**
 *
 * @author uko
 */
public class CategoryChildFactory extends ChildFactory<String>
{
	@Override
	protected boolean createKeys(List<String> list)
	{
		list.add("Logical");
		return true;
	}
	@Override
	protected Node createNodeForKey(String category)
	{
		Node node = new AbstractNode(Children.create(new ElementChildFactory(category), true));
		node.setDisplayName(category);
		return node;
	}

	private class ElementChildFactory extends ChildFactory<mxCell>
	{
		private String category;
		private ElementChildFactory(String category)
		{
			this.category = category;
		}
		@Override
		protected boolean createKeys(List<mxCell> list)
		{
			list.add(new ElementModel("Hello", new mxGeometry(0,0,100,100), "", 2, 1));
			return true;
		}
		@Override
		protected Node createNodeForKey(mxCell element)
		{
			Node node = new AbstractNode(Children.LEAF);
			node.setDisplayName("Element");
			return node;
		}
	}

}
