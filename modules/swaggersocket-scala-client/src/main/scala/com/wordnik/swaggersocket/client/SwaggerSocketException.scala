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
package com.wordnik.swaggersocket.client

/**
 * When a SwaggerSocket protocol exception occurs.
 */
class SwaggerSocketException(status : Int, reasonPhrase : String) extends RuntimeException("SwaggerSocket unexpected protocol response") {

  /**
   * Return the status code of the exception
   * @return the status code of the exception
   */
  def getStatusCode : Int = {
    status
  }

  /**
   * Return the reason phrase of the exception
   * @return the reason phrase of the exception
   */
  def getReasonPhrase : String = {
    reasonPhrase
  }
}