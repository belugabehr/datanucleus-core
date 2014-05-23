/**********************************************************************
Copyright (c) 2008 Andy Jefferson and others. All rights reserved.
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
 * An exception thrown when an unsupported transaction isolation level is requested.
 */
public class TransactionIsolationNotSupportedException extends NucleusUserException
{
    /**
     * Constructs a transaction already active exception with the specified detail message.
     * @param level Isolation level
     */
    public TransactionIsolationNotSupportedException(String level)
    {
        super(Localiser.msg("015043", level));
    }
}