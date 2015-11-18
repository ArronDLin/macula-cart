/**
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.macula.cart.repository;

import java.util.List;

import org.macula.cart.domain.DemoApplication;
import org.macula.cart.domain.DemoApplicationInstance;
import org.macula.core.repository.MaculaJpaRepository;

/**
 * <p> </p>
 * 
 * @since 2011-2-23
 * @author Wilson Luo
 * @version $Id: DemoApplicationInstanceRepository.java 1734 2015-11-18 01:28:36Z wzp $
 */
public interface DemoApplicationInstanceRepository extends MaculaJpaRepository<DemoApplicationInstance, Long> {

	List<DemoApplicationInstance> findByApplication(DemoApplication application);
}
