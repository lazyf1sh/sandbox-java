package com.github.lazyf1sh.sandbox.wicket.examples.common.nestedthings.dialogs;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;

/**
 * @author Ivan Kopylov
 */
public class NestedModalWindowExamplePage extends WebPage
{

    @Override
    protected void onInitialize()
    {
        super.onInitialize();

        ModalWindow modalWindow = new ModalWindow("modalWindow");
        modalWindow.setContent(new MyModalWindow1(modalWindow.getContentId())
        {
            @Override
            public void onCloseNested2(AjaxRequestTarget target)
            {
                modalWindow.close(target);
            }
        });
        add(modalWindow);

        add(new AjaxLink<Void>("showModalWindow")
        {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick(AjaxRequestTarget target)
            {
                modalWindow.show(target);
            }
        });
    }
}