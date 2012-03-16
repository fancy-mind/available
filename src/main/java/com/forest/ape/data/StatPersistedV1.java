// File generated by hadoop record compiler. Do not edit.
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.forest.ape.data;

import org.apache.jute.*;

public class StatPersistedV1 implements Record {
	private long czxid;
	private long mzxid;
	private long ctime;
	private long mtime;
	private int version;
	private int cversion;
	private int aversion;
	private long ephemeralOwner;

	public StatPersistedV1() {
	}

	public StatPersistedV1(long czxid, long mzxid, long ctime, long mtime, int version,
			int cversion, int aversion, long ephemeralOwner) {
		this.czxid = czxid;
		this.mzxid = mzxid;
		this.ctime = ctime;
		this.mtime = mtime;
		this.version = version;
		this.cversion = cversion;
		this.aversion = aversion;
		this.ephemeralOwner = ephemeralOwner;
	}

	public long getCzxid() {
		return czxid;
	}

	public void setCzxid(long m_) {
		czxid = m_;
	}

	public long getMzxid() {
		return mzxid;
	}

	public void setMzxid(long m_) {
		mzxid = m_;
	}

	public long getCtime() {
		return ctime;
	}

	public void setCtime(long m_) {
		ctime = m_;
	}

	public long getMtime() {
		return mtime;
	}

	public void setMtime(long m_) {
		mtime = m_;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int m_) {
		version = m_;
	}

	public int getCversion() {
		return cversion;
	}

	public void setCversion(int m_) {
		cversion = m_;
	}

	public int getAversion() {
		return aversion;
	}

	public void setAversion(int m_) {
		aversion = m_;
	}

	public long getEphemeralOwner() {
		return ephemeralOwner;
	}

	public void setEphemeralOwner(long m_) {
		ephemeralOwner = m_;
	}

	public void serialize(OutputArchive a_, String tag) throws java.io.IOException {
		a_.startRecord(this, tag);
		a_.writeLong(czxid, "czxid");
		a_.writeLong(mzxid, "mzxid");
		a_.writeLong(ctime, "ctime");
		a_.writeLong(mtime, "mtime");
		a_.writeInt(version, "version");
		a_.writeInt(cversion, "cversion");
		a_.writeInt(aversion, "aversion");
		a_.writeLong(ephemeralOwner, "ephemeralOwner");
		a_.endRecord(this, tag);
	}

	public void deserialize(InputArchive a_, String tag) throws java.io.IOException {
		a_.startRecord(tag);
		czxid = a_.readLong("czxid");
		mzxid = a_.readLong("mzxid");
		ctime = a_.readLong("ctime");
		mtime = a_.readLong("mtime");
		version = a_.readInt("version");
		cversion = a_.readInt("cversion");
		aversion = a_.readInt("aversion");
		ephemeralOwner = a_.readLong("ephemeralOwner");
		a_.endRecord(tag);
	}

	public String toString() {
		try {
			java.io.ByteArrayOutputStream s = new java.io.ByteArrayOutputStream();
			CsvOutputArchive a_ = new CsvOutputArchive(s);
			a_.startRecord(this, "");
			a_.writeLong(czxid, "czxid");
			a_.writeLong(mzxid, "mzxid");
			a_.writeLong(ctime, "ctime");
			a_.writeLong(mtime, "mtime");
			a_.writeInt(version, "version");
			a_.writeInt(cversion, "cversion");
			a_.writeInt(aversion, "aversion");
			a_.writeLong(ephemeralOwner, "ephemeralOwner");
			a_.endRecord(this, "");
			return new String(s.toByteArray(), "UTF-8");
		} catch (Throwable ex) {
			ex.printStackTrace();
		}
		return "ERROR";
	}

	public void write(java.io.DataOutput out) throws java.io.IOException {
		BinaryOutputArchive archive = new BinaryOutputArchive(out);
		serialize(archive, "");
	}

	public void readFields(java.io.DataInput in) throws java.io.IOException {
		BinaryInputArchive archive = new BinaryInputArchive(in);
		deserialize(archive, "");
	}

	public int compareTo(Object peer_) throws ClassCastException {
		if (!(peer_ instanceof StatPersistedV1)) {
			throw new ClassCastException("Comparing different types of records.");
		}
		StatPersistedV1 peer = (StatPersistedV1) peer_;
		int ret = 0;
		ret = (czxid == peer.czxid) ? 0 : ((czxid < peer.czxid) ? -1 : 1);
		if (ret != 0)
			return ret;
		ret = (mzxid == peer.mzxid) ? 0 : ((mzxid < peer.mzxid) ? -1 : 1);
		if (ret != 0)
			return ret;
		ret = (ctime == peer.ctime) ? 0 : ((ctime < peer.ctime) ? -1 : 1);
		if (ret != 0)
			return ret;
		ret = (mtime == peer.mtime) ? 0 : ((mtime < peer.mtime) ? -1 : 1);
		if (ret != 0)
			return ret;
		ret = (version == peer.version) ? 0 : ((version < peer.version) ? -1 : 1);
		if (ret != 0)
			return ret;
		ret = (cversion == peer.cversion) ? 0 : ((cversion < peer.cversion) ? -1 : 1);
		if (ret != 0)
			return ret;
		ret = (aversion == peer.aversion) ? 0 : ((aversion < peer.aversion) ? -1 : 1);
		if (ret != 0)
			return ret;
		ret = (ephemeralOwner == peer.ephemeralOwner) ? 0
				: ((ephemeralOwner < peer.ephemeralOwner) ? -1 : 1);
		if (ret != 0)
			return ret;
		return ret;
	}

	public boolean equals(Object peer_) {
		if (!(peer_ instanceof StatPersistedV1)) {
			return false;
		}
		if (peer_ == this) {
			return true;
		}
		StatPersistedV1 peer = (StatPersistedV1) peer_;
		boolean ret = false;
		ret = (czxid == peer.czxid);
		if (!ret)
			return ret;
		ret = (mzxid == peer.mzxid);
		if (!ret)
			return ret;
		ret = (ctime == peer.ctime);
		if (!ret)
			return ret;
		ret = (mtime == peer.mtime);
		if (!ret)
			return ret;
		ret = (version == peer.version);
		if (!ret)
			return ret;
		ret = (cversion == peer.cversion);
		if (!ret)
			return ret;
		ret = (aversion == peer.aversion);
		if (!ret)
			return ret;
		ret = (ephemeralOwner == peer.ephemeralOwner);
		if (!ret)
			return ret;
		return ret;
	}

	public int hashCode() {
		int result = 17;
		int ret;
		ret = (int) (czxid ^ (czxid >>> 32));
		result = 37 * result + ret;
		ret = (int) (mzxid ^ (mzxid >>> 32));
		result = 37 * result + ret;
		ret = (int) (ctime ^ (ctime >>> 32));
		result = 37 * result + ret;
		ret = (int) (mtime ^ (mtime >>> 32));
		result = 37 * result + ret;
		ret = (int) version;
		result = 37 * result + ret;
		ret = (int) cversion;
		result = 37 * result + ret;
		ret = (int) aversion;
		result = 37 * result + ret;
		ret = (int) (ephemeralOwner ^ (ephemeralOwner >>> 32));
		result = 37 * result + ret;
		return result;
	}

	public static String signature() {
		return "LStatPersistedV1(lllliiil)";
	}
}
