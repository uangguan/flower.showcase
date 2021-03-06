/**
 * Copyright © 2019 同程艺龙 (zhihui.li@ly.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ly.train.flower.showcase.service.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ly.train.flower.common.annotation.FlowerService;
import com.ly.train.flower.common.core.service.ServiceContext;
import com.ly.train.flower.core.service.impl.AbstractService;
import com.ly.train.flower.showcase.model.User;

/**
 * @author leeyazhou
 */
@FlowerService
public class UserServiceA extends AbstractService<User, User> {
  static final Logger logger = LoggerFactory.getLogger(UserServiceA.class);

  @Override
  public User doProcess(User message, ServiceContext context) throws Throwable {
    logger.info("处理任务 message : {}", message);
    Integer age = message.getAge();
    if (age == null) {
      age = 0;
    }
    message.setAge(++age);
    return message;
  }

}
