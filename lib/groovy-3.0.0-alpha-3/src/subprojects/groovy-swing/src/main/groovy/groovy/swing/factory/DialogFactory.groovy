/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package groovy.swing.factory

import javax.swing.*
import java.awt.*

public class DialogFactory extends groovy.swing.factory.RootPaneContainerFactory {

    public Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
        JDialog dialog
        if (FactoryBuilderSupport.checkValueIsType(value, name, JDialog)) {
            dialog = value
        } else {
            Object owner = attributes.remove("owner")
            LinkedList containingWindows = builder.containingWindows
            // if owner not explicit, use the last window type in the list
            if ((owner == null) && !containingWindows.isEmpty()) {
                owner = containingWindows.getLast()
            }
            if (owner instanceof Frame) {
                dialog = new JDialog((Frame) owner)
            } else if (owner instanceof Dialog) {
                dialog = new JDialog((Dialog) owner)
            } else {
                dialog = new JDialog()
            }
        }

        handleRootPaneTasks(builder, dialog, attributes)

        return dialog
    }

}
