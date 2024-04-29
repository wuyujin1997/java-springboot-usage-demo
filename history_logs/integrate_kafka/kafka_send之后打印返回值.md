
```log
2024-04-30 07:28:10.697  INFO 48167 --- [nio-8888-exec-2] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = -1
	batch.size = 16384
	bootstrap.servers = [localhost:9092]
	buffer.memory = 33554432
	client.dns.lookup = use_all_dns_ips
	client.id = producer-1
	compression.type = none
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = true
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.class = class org.apache.kafka.clients.producer.internals.DefaultPartitioner
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.apache.kafka.common.serialization.StringSerializer

2024-04-30 07:28:10.721  INFO 48167 --- [nio-8888-exec-2] o.a.k.clients.producer.KafkaProducer     : [Producer clientId=producer-1] Instantiated an idempotent producer.
2024-04-30 07:28:10.753  INFO 48167 --- [nio-8888-exec-2] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.1.2
2024-04-30 07:28:10.754  INFO 48167 --- [nio-8888-exec-2] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: f8c67dc3ae0a3265
2024-04-30 07:28:10.754  INFO 48167 --- [nio-8888-exec-2] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1714433290753
2024-04-30 07:28:10.802  INFO 48167 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Resetting the last seen epoch of partition topic_yujin_demo_01-0 to 0 since the associated topicId changed from null to _iY6wvG6TdOWjKqGlHerrQ
2024-04-30 07:28:10.803  INFO 48167 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: u_7FU6jATFi06Pczr4EfGA
2024-04-30 07:28:10.906  INFO 48167 --- [ad | producer-1] o.a.k.c.p.internals.TransactionManager   : [Producer clientId=producer-1] ProducerId set to 2000 with epoch 0
2024-04-30 07:28:11.019  INFO 48167 --- [nio-8888-exec-2] c.w.d.service.impl.MyKafkaProducerImpl   : sendResult SendResult [producerRecord=ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), key=null, value=good morning, timestamp=null), recordMetadata=topic_yujin_demo_01-0@6]
2024-04-30 07:28:11.019  INFO 48167 --- [ad | producer-1] c.w.demo.service.KafkaSendResultHandler  : kafka消息发送成功 ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), key=null, value=good morning, timestamp=null) topic_yujin_demo_01-0@6
2024-04-30 07:28:11.044  INFO 48167 --- [ner_id_01-0-C-1] c.w.d.service.impl.MyKafkaProducerImpl   : 监听器从kakfa读取到新消息： good morning


2024-04-30 07:28:34.331  INFO 48167 --- [nio-8888-exec-4] c.w.d.service.impl.MyKafkaProducerImpl   : sendResult SendResult [producerRecord=ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), key=null, value=good morning. 222, timestamp=null), recordMetadata=topic_yujin_demo_01-0@7]
2024-04-30 07:28:34.331  INFO 48167 --- [ad | producer-1] c.w.demo.service.KafkaSendResultHandler  : kafka消息发送成功 ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), key=null, value=good morning. 222, timestamp=null) topic_yujin_demo_01-0@7
2024-04-30 07:28:34.350  INFO 48167 --- [ner_id_01-0-C-1] c.w.d.service.impl.MyKafkaProducerImpl   : 监听器从kakfa读取到新消息： good morning. 222

```