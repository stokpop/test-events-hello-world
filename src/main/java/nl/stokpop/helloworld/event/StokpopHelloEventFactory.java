package nl.stokpop.helloworld.event;

/*-
 *
 * test-events-hello-world
 *
 * Copyright (C) 2019 Stokpop
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

import nl.stokpop.eventscheduler.api.Event;
import nl.stokpop.eventscheduler.api.EventFactory;
import nl.stokpop.eventscheduler.api.EventLogger;
import nl.stokpop.eventscheduler.api.message.EventMessageBus;

public class StokpopHelloEventFactory implements EventFactory<StokpopHelloEventContext> {

    @Override
    public Event create(StokpopHelloEventContext context, EventMessageBus messageBus, EventLogger eventLogger) {
        return new StokpopHelloEvent(context, messageBus, eventLogger);
    }
}
