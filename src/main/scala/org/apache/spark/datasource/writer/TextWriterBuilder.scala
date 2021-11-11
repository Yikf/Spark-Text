/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */

package org.apache.spark.datasource.writer

import org.apache.spark.sql.connector.write.streaming.StreamingWrite
import org.apache.spark.sql.connector.write.{BatchWrite, WriteBuilder}

class TextWriterBuilder extends WriteBuilder {

  override def buildForBatch(): BatchWrite = super.buildForBatch()

  override def buildForStreaming(): StreamingWrite = super.buildForStreaming()
}
