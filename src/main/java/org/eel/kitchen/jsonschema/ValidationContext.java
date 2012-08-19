/*
 * Copyright (c) 2012, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.eel.kitchen.jsonschema;

import org.eel.kitchen.jsonschema.schema.JsonSchemaFactory;
import org.eel.kitchen.jsonschema.schema.SchemaContainer;

public final class ValidationContext
{
    private SchemaContainer container;
    private final JsonSchemaFactory factory;

    public ValidationContext(final JsonSchemaFactory factory)
    {
        this.factory = factory;
    }

    public JsonSchemaFactory getFactory()
    {
        return factory;
    }

    public SchemaContainer getContainer()
    {
        return container;
    }

    public void setContainer(final SchemaContainer container)
    {
        this.container = container;
    }
}