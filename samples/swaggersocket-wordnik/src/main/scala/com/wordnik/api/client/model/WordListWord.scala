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


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author tony
 *
 */
class WordListWord extends Object {

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
    var createdAt:Date =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var userId:Long =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var numberCommentsOnWord:Long =_

	/**
	 * 
	 * 
	 * 
	 */
    @BeanProperty
    var userName:String =_

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
    var numberLists:Long =_

    override def toString:String = {
        "[" +
        "id:" + id + 
            "createdAt:" + createdAt + 
            "userId:" + userId + 
            "numberCommentsOnWord:" + numberCommentsOnWord + 
            "userName:" + userName + 
            "word:" + word + 
            "numberLists:" + numberLists + "]"
    }
}