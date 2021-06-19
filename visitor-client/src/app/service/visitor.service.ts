import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/internal/Observable';
import {Visitor} from '../models/visitor';

@Injectable({
  providedIn: 'root'
})
export class VisitorService {

  private BASE_URL: string = 'api';

  constructor(private httpClient: HttpClient) {
  }

  public getVisitors(): Observable<Visitor[]> {
    return this.httpClient.get<Visitor[]>(this.BASE_URL + '/visitors');
  }

  create(visitor: Visitor): Observable<Visitor> {
    return this.httpClient.post<Visitor>(this.BASE_URL + '/visitors', visitor);
  }
}
