/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */

package org.apache.spark.datasource

import org.apache.spark.internal.Logging
import org.apache.spark.sql.connector.catalog.{Identifier, Table, TableCatalog, TableChange}
import org.apache.spark.sql.connector.expressions.Transform
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.util.CaseInsensitiveStringMap

import java.util

class TextCatalog extends TableCatalog with Logging {
  override def listTables(namespace: Array[String]): Array[Identifier] = {
    Array.empty[Identifier]
  }

  override def loadTable(ident: Identifier): Table = {
    new TextTable
  }

  override def createTable(ident: Identifier, schema: StructType, partitions: Array[Transform], properties: util.Map[String, String]): Table = {
    logInfo(s"[ykf] Create table: ${ident.name()} = ${ident.namespace().mkString} = $schema")
    new TextTable
  }

  override def alterTable(ident: Identifier, changes: TableChange*): Table = {
    logInfo("[ykf] alter table")
    new TextTable
  }

  override def dropTable(ident: Identifier): Boolean = {
    logInfo("[ykf] drop table")
    true
  }

  override def renameTable(oldIdent: Identifier, newIdent: Identifier): Unit = {
    logInfo("[ykf] rename table")
  }

  override def initialize(name: String, options: CaseInsensitiveStringMap): Unit = {
    logInfo("[ykf] initialize table")
  }

  override def name(): String = {
    "textv2"
  }
}
