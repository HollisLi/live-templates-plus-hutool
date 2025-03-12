package com.github.hollis;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import com.sun.jna.platform.win32.Sspi;
import org.jetbrains.annotations.NotNull;

/**
 * Java Context
 *
 * @author Hollis
 * @since 2024-07-05 15:01
 */
final class JavaContext extends TemplateContextType {

    JavaContext() {
        super("Java");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".java");
    }

}