/**********************************************************************
Copyright (c) 2006 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.exceptions;

import org.datanucleus.util.Localiser;

/**
 * An exception thrown when an operation is invoked that requires a persistable object yet the object passed in 
 * is not suitable. This usually means that it hasn't been enhanced.
 */
public class ClassNotPersistableException extends NucleusUserException
{
    /**
     * Constructs a class-not-persistable exception with the specified detail message.
     * @param className Name of the class
     */
    public ClassNotPersistableException(String className)
    {
        super(Localiser.msg("018000", className));
    }

    /**
     * Constructs a class-not-persistable exception with the specified detail message and nested exception.
     * @param className name of the class
     * @param nested the nested exception(s).
     */
    public ClassNotPersistableException(String className, Exception nested)
    {
        super(Localiser.msg("018000", className), nested);
    }
}