package com.github.lazyf1sh.sandbox.wicket.examples.nested.forms;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * @author Ivan Kopylov
 */
public class NestedPanel extends Panel
{
    public NestedPanel(String id)
    {
        super(id);
    }

    @Override
    protected void onInitialize()
    {
        super.onInitialize();


        Form<?> childForm = new Form<Void>("parentForm");
        add(childForm);


        childForm.add(new AjaxButton("saveButton", childForm)
        {
            private static final long serialVersionUID = 1L;

            @Override
            protected void onSubmit(AjaxRequestTarget target)
            {
                super.onSubmit(target);
            }
        });
    }
}
