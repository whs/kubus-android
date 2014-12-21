// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protobuf/message.proto
package th.in.whs.ku.bus.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.DOUBLE;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Datatype.UINT32;
import static com.squareup.wire.Message.Datatype.UINT64;
import static com.squareup.wire.Message.Label.REPEATED;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class Packet extends Message {

  public static final List<BusUpdate> DEFAULT_ADD = Collections.emptyList();
  public static final List<BusDelete> DEFAULT_DEL = Collections.emptyList();
  public static final List<BusUpdate> DEFAULT_UNCOMPRESSED = Collections.emptyList();
  public static final List<BusPosition> DEFAULT_POSITION = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public final List<BusUpdate> add;

  @ProtoField(tag = 2, label = REPEATED)
  public final List<BusDelete> del;

  /**
   * given when connecting
   */
  @ProtoField(tag = 3, label = REPEATED)
  public final List<BusUpdate> uncompressed;

  /**
   * added 30 jan 2014
   */
  @ProtoField(tag = 4, label = REPEATED)
  public final List<BusPosition> position;

  public Packet(List<BusUpdate> add, List<BusDelete> del, List<BusUpdate> uncompressed, List<BusPosition> position) {
    this.add = immutableCopyOf(add);
    this.del = immutableCopyOf(del);
    this.uncompressed = immutableCopyOf(uncompressed);
    this.position = immutableCopyOf(position);
  }

  private Packet(Builder builder) {
    this(builder.add, builder.del, builder.uncompressed, builder.position);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Packet)) return false;
    Packet o = (Packet) other;
    return equals(add, o.add)
        && equals(del, o.del)
        && equals(uncompressed, o.uncompressed)
        && equals(position, o.position);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = add != null ? add.hashCode() : 1;
      result = result * 37 + (del != null ? del.hashCode() : 1);
      result = result * 37 + (uncompressed != null ? uncompressed.hashCode() : 1);
      result = result * 37 + (position != null ? position.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Packet> {

    public List<BusUpdate> add;
    public List<BusDelete> del;
    public List<BusUpdate> uncompressed;
    public List<BusPosition> position;

    public Builder() {
    }

    public Builder(Packet message) {
      super(message);
      if (message == null) return;
      this.add = copyOf(message.add);
      this.del = copyOf(message.del);
      this.uncompressed = copyOf(message.uncompressed);
      this.position = copyOf(message.position);
    }

    public Builder add(List<BusUpdate> add) {
      this.add = checkForNulls(add);
      return this;
    }

    public Builder del(List<BusDelete> del) {
      this.del = checkForNulls(del);
      return this;
    }

    /**
     * given when connecting
     */
    public Builder uncompressed(List<BusUpdate> uncompressed) {
      this.uncompressed = checkForNulls(uncompressed);
      return this;
    }

    /**
     * added 30 jan 2014
     */
    public Builder position(List<BusPosition> position) {
      this.position = checkForNulls(position);
      return this;
    }

    @Override
    public Packet build() {
      return new Packet(this);
    }
  }

  public static final class BusUpdate extends Message {

    public static final Integer DEFAULT_ID = 0;
    public static final Double DEFAULT_LATITUDE = 0D;
    public static final Double DEFAULT_LONGITUDE = 0D;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_LINEID = 0;
    public static final Boolean DEFAULT_ISINLINE = false;
    public static final Boolean DEFAULT_ISINPARK = false;
    public static final Boolean DEFAULT_AVAILABLE = false;
    public static final Long DEFAULT_TIMESTAMP = 0L;
    public static final String DEFAULT_EXTRA = "";

    @ProtoField(tag = 1, type = UINT32, label = REQUIRED)
    public final Integer id;

    @ProtoField(tag = 2, type = DOUBLE, label = REQUIRED)
    public final Double latitude;

    @ProtoField(tag = 3, type = DOUBLE, label = REQUIRED)
    public final Double longitude;

    /**
     * optional uint32 no = 4;
     */
    @ProtoField(tag = 5, type = STRING)
    public final String name;

    @ProtoField(tag = 6, type = UINT32)
    public final Integer lineid;

    @ProtoField(tag = 7, type = BOOL)
    public final Boolean isinline;

    @ProtoField(tag = 8, type = BOOL)
    public final Boolean isinpark;

    @ProtoField(tag = 9, type = BOOL)
    public final Boolean available;

    @ProtoField(tag = 10, type = UINT64)
    public final Long timestamp;

    @ProtoField(tag = 100, type = STRING)
    public final String extra;

    public BusUpdate(Integer id, Double latitude, Double longitude, String name, Integer lineid, Boolean isinline, Boolean isinpark, Boolean available, Long timestamp, String extra) {
      this.id = id;
      this.latitude = latitude;
      this.longitude = longitude;
      this.name = name;
      this.lineid = lineid;
      this.isinline = isinline;
      this.isinpark = isinpark;
      this.available = available;
      this.timestamp = timestamp;
      this.extra = extra;
    }

    private BusUpdate(Builder builder) {
      this(builder.id, builder.latitude, builder.longitude, builder.name, builder.lineid, builder.isinline, builder.isinpark, builder.available, builder.timestamp, builder.extra);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof BusUpdate)) return false;
      BusUpdate o = (BusUpdate) other;
      return equals(id, o.id)
          && equals(latitude, o.latitude)
          && equals(longitude, o.longitude)
          && equals(name, o.name)
          && equals(lineid, o.lineid)
          && equals(isinline, o.isinline)
          && equals(isinpark, o.isinpark)
          && equals(available, o.available)
          && equals(timestamp, o.timestamp)
          && equals(extra, o.extra);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = id != null ? id.hashCode() : 0;
        result = result * 37 + (latitude != null ? latitude.hashCode() : 0);
        result = result * 37 + (longitude != null ? longitude.hashCode() : 0);
        result = result * 37 + (name != null ? name.hashCode() : 0);
        result = result * 37 + (lineid != null ? lineid.hashCode() : 0);
        result = result * 37 + (isinline != null ? isinline.hashCode() : 0);
        result = result * 37 + (isinpark != null ? isinpark.hashCode() : 0);
        result = result * 37 + (available != null ? available.hashCode() : 0);
        result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
        result = result * 37 + (extra != null ? extra.hashCode() : 0);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<BusUpdate> {

      public Integer id;
      public Double latitude;
      public Double longitude;
      public String name;
      public Integer lineid;
      public Boolean isinline;
      public Boolean isinpark;
      public Boolean available;
      public Long timestamp;
      public String extra;

      public Builder() {
      }

      public Builder(BusUpdate message) {
        super(message);
        if (message == null) return;
        this.id = message.id;
        this.latitude = message.latitude;
        this.longitude = message.longitude;
        this.name = message.name;
        this.lineid = message.lineid;
        this.isinline = message.isinline;
        this.isinpark = message.isinpark;
        this.available = message.available;
        this.timestamp = message.timestamp;
        this.extra = message.extra;
      }

      public Builder id(Integer id) {
        this.id = id;
        return this;
      }

      public Builder latitude(Double latitude) {
        this.latitude = latitude;
        return this;
      }

      public Builder longitude(Double longitude) {
        this.longitude = longitude;
        return this;
      }

      /**
       * optional uint32 no = 4;
       */
      public Builder name(String name) {
        this.name = name;
        return this;
      }

      public Builder lineid(Integer lineid) {
        this.lineid = lineid;
        return this;
      }

      public Builder isinline(Boolean isinline) {
        this.isinline = isinline;
        return this;
      }

      public Builder isinpark(Boolean isinpark) {
        this.isinpark = isinpark;
        return this;
      }

      public Builder available(Boolean available) {
        this.available = available;
        return this;
      }

      public Builder timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
      }

      public Builder extra(String extra) {
        this.extra = extra;
        return this;
      }

      @Override
      public BusUpdate build() {
        checkRequiredFields();
        return new BusUpdate(this);
      }
    }
  }

  public static final class BusDelete extends Message {

    public static final Integer DEFAULT_ID = 0;

    @ProtoField(tag = 1, type = UINT32, label = REQUIRED)
    public final Integer id;

    public BusDelete(Integer id) {
      this.id = id;
    }

    private BusDelete(Builder builder) {
      this(builder.id);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof BusDelete)) return false;
      return equals(id, ((BusDelete) other).id);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = id != null ? id.hashCode() : 0);
    }

    public static final class Builder extends Message.Builder<BusDelete> {

      public Integer id;

      public Builder() {
      }

      public Builder(BusDelete message) {
        super(message);
        if (message == null) return;
        this.id = message.id;
      }

      public Builder id(Integer id) {
        this.id = id;
        return this;
      }

      @Override
      public BusDelete build() {
        checkRequiredFields();
        return new BusDelete(this);
      }
    }
  }

  public static final class BusPosition extends Message {

    public static final Integer DEFAULT_ID = 0;
    public static final Double DEFAULT_LATITUDE = 0D;
    public static final Double DEFAULT_LONGITUDE = 0D;

    /**
     * same as busupdate, but for position only
     */
    @ProtoField(tag = 1, type = UINT32, label = REQUIRED)
    public final Integer id;

    @ProtoField(tag = 2, type = DOUBLE, label = REQUIRED)
    public final Double latitude;

    @ProtoField(tag = 3, type = DOUBLE, label = REQUIRED)
    public final Double longitude;

    public BusPosition(Integer id, Double latitude, Double longitude) {
      this.id = id;
      this.latitude = latitude;
      this.longitude = longitude;
    }

    private BusPosition(Builder builder) {
      this(builder.id, builder.latitude, builder.longitude);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof BusPosition)) return false;
      BusPosition o = (BusPosition) other;
      return equals(id, o.id)
          && equals(latitude, o.latitude)
          && equals(longitude, o.longitude);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = id != null ? id.hashCode() : 0;
        result = result * 37 + (latitude != null ? latitude.hashCode() : 0);
        result = result * 37 + (longitude != null ? longitude.hashCode() : 0);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends Message.Builder<BusPosition> {

      public Integer id;
      public Double latitude;
      public Double longitude;

      public Builder() {
      }

      public Builder(BusPosition message) {
        super(message);
        if (message == null) return;
        this.id = message.id;
        this.latitude = message.latitude;
        this.longitude = message.longitude;
      }

      /**
       * same as busupdate, but for position only
       */
      public Builder id(Integer id) {
        this.id = id;
        return this;
      }

      public Builder latitude(Double latitude) {
        this.latitude = latitude;
        return this;
      }

      public Builder longitude(Double longitude) {
        this.longitude = longitude;
        return this;
      }

      @Override
      public BusPosition build() {
        checkRequiredFields();
        return new BusPosition(this);
      }
    }
  }
}
