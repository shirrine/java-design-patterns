package com.shirrine.patterns.foobarmv.composite;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


/**
 * Test the composite pattern.
 *
 * @author Shirrine
 */
public class CompositeTest {

    /**
     * Tests a few composite parts.
     */
    @Test
    public void testParts() {

        // Create items
        Item nut = new Part("Nut", 5);
        assertThat(nut.toString(), is(equalTo("Nut (cost $5)")));
        Item bolt = new Part("Bolt", 9);
        assertThat(bolt.toString(), is(equalTo("Bolt (cost $9)")));
        Item panel = new Part("Panel", 35);
        assertThat(panel.toString(), is(equalTo("Panel (cost $35)")));

        // Show the parts
        System.out.println(nut);
        System.out.println(bolt);
        System.out.println(panel);
    }

    /**
     * Tests an assembly.
     */
    @Test
    public void testAssembly() {

        // Create items
        Item nut = new Part("Nut", 5);
        Item bolt = new Part("Bolt", 9);
        Item panel = new Part("Panel", 35);

        // Create an assembly
        Item gizmo = new Assembly("Gizmo");
        gizmo.addItem(nut);
        gizmo.addItem(bolt);
        gizmo.addItem(panel);
        assertThat(gizmo.getItems().length, is(equalTo(3)));
        assertThat(gizmo.getCost(), is(equalTo(49)));

        // Show the assembly
        System.out.println(gizmo);

    }

    /**
     * Tests an assembly... of an assembly (and a part). :-P
     */
    @Test
    public void testAssemblies() {

        // Create items
        Item nut = new Part("Nut", 5);
        Item bolt = new Part("Bolt", 9);
        Item panel = new Part("Panel", 35);

        // Create an assembly
        Item gizmo = new Assembly("Gizmo");
        gizmo.addItem(nut);
        gizmo.addItem(bolt);
        gizmo.addItem(panel);

        // Create an assembly of an assembly and a part
        Item widget = new Assembly("Widget");
        widget.addItem(gizmo);
        widget.addItem(nut);
        assertThat(widget.getItems().length, is(equalTo(2)));
        assertThat(widget.getCost(), is(equalTo(54)));

        // Show the assembly
        System.out.println(widget);
    }

}
