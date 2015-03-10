/**
 *  Copyright 2015 Reverb Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
 
package com.wordnik.api.client.model

import com.wordnik.swagger.runtime.annotations._

import scala.reflect.BeanProperty

import scala.collection.JavaConversions._

import java.util.Date
import scala.collection.mutable.ListBuffer


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author tony
 *
 */
class WordOfTheDay extends Object {

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var id:Long =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var parentId:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var category:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var createdBy:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var createdAt:Date =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var contentProvider:ContentProvider =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var word:String =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var htmlExtra:String =_

	/**
	 * 
	 * 
	 * 
	 */
	var definitions  =  new ListBuffer[Definition]
	def getDefinitions:java.util.List[com.wordnik.api.client.model.Definition] = {
	    definitions.toList
	}
	def setDefinitions(args:java.util.List[com.wordnik.api.client.model.Definition]) = {
	    definitions.clear
	    args.foreach(arg=>definitions += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
	var examples  =  new ListBuffer[Example]
	def getExamples:java.util.List[com.wordnik.api.client.model.Example] = {
	    examples.toList
	}
	def setExamples(args:java.util.List[com.wordnik.api.client.model.Example]) = {
	    examples.clear
	    args.foreach(arg=>examples += arg)
	}

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var publishDate:Date =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var note:String =_

    override def toString:String = {
        "[" +
        "id:" + id + 
            "parentId:" + parentId + 
            "category:" + category + 
            "createdBy:" + createdBy + 
            "createdAt:" + createdAt + 
            "contentProvider:" + contentProvider + 
            "word:" + word + 
            "htmlExtra:" + htmlExtra + 
            "definitions:" + definitions + 
            "examples:" + examples + 
            "publishDate:" + publishDate + 
            "note:" + note + "]"
    }
}